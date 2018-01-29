package br.com.adaptive.adptivecuba.portal.controllers;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.haulmont.cuba.core.app.DataService;
import com.haulmont.cuba.core.global.LoadContext;

import br.com.adaptive.adptivecuba.entity.Noticia;


@Controller
public class PortalController {

    @Inject
    protected DataService dataService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        LoadContext<Noticia> l = new LoadContext<Noticia>(Noticia.class);
        l.setQueryString("select n from adptivecuba$Noticia n");
        model.addAttribute("noticias", dataService.loadList(l));
        return "index";
    }
}
