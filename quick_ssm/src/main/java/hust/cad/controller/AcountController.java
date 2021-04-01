package hust.cad.controller;

import hust.cad.domain.Acount;
import hust.cad.service.AcountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/acount")
public class AcountController {

    @Autowired
    private AcountService acountService;


    //保存业务，保存成功以后，给也页面输出“保存成功”
    @RequestMapping(value = "/save", produces ="text/html;charset=utf-8")
    @ResponseBody
    public String save(Acount acount){
        acountService.save(acount);
        return "恭喜你保存成功";
    }

    //查询所有业务
    @RequestMapping("/findAll")
    public ModelAndView findAll(){
        List<Acount> acountList = acountService.findAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("acountList",acountList);
        modelAndView.setViewName("acountList");
        return modelAndView;
    }
}
