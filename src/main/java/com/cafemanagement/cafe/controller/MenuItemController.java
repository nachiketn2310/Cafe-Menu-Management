package com.cafemanagement.cafe.controller;


import com.cafemanagement.cafe.model.MenuItem;
import com.cafemanagement.cafe.service.MenuItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MenuItemController {
    @Autowired
    private MenuItemService menuItemService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("menuItems", menuItemService.getAllMenuItems());
        return "index";
    }

    @GetMapping("/showNewMenuItemForm")
    public String showNewMenuItemForm(Model model) {
        MenuItem menuItem = new MenuItem();
        model.addAttribute("menuItem", menuItem);
        return "new_menu_item";
    }

    @PostMapping("/saveMenuItem")
    public String saveMenuItem(@ModelAttribute("menuItem") MenuItem menuItem) {
        menuItemService.saveMenuItem(menuItem);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
        MenuItem menuItem = menuItemService.getMenuItemById(id).orElse(null);
        model.addAttribute("menuItem", menuItem);
        return "update_menu_item";
    }

    @GetMapping("/deleteMenuItem/{id}")
    public String deleteMenuItem(@PathVariable(value = "id") long id) {
        menuItemService.deleteMenuItem(id);
        return "redirect:/";
    }
}
