/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Linkunder
 */
@Controller

public class HomeController 
{
    
    @RequestMapping("home.htm")
    public ModelAndView home()
    {
        ModelAndView mav = new ModelAndView();
        //Se setea el nombre de la vista al ModelAndView
        mav.setViewName("home");
        return mav;
    }
    @RequestMapping("nosotros.htm")
    public ModelAndView nosotros()
    {
        ModelAndView mav = new ModelAndView();
        //Se setea el nombre de la vista al ModelAndView
        //This sets the name to the view
        mav.setViewName("nosotros");
        return mav;
    }
    
    @RequestMapping("parametros.htm")
    public ModelAndView parametros(HttpServletRequest request)
    {
         
        ModelAndView mav = new ModelAndView();
        mav.setViewName("parametros");
        //Valores por get
        String id = request.getParameter("id");
        String nombre = request.getParameter("nombre");
        mav.addObject("id", id);
        mav.addObject("nombre", nombre);
        return mav;
    }
    
    
}
