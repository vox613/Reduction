package com.stc21.boot.auction.controller;

import com.stc21.boot.auction.dto.LotDto;
import com.stc21.boot.auction.service.LotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path = "lot")
public class LotController {

    @Autowired
    private LotService lotService;

    @GetMapping()
    public String showLotPage(Model model,
                              @RequestParam(name = "id") Long id) {
        LotDto lotDto = lotService.findById(id);
        model.addAttribute("lot", lotDto);
        return "lot";
    }
}
