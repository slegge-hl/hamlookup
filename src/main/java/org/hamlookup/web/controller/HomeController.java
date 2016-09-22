/*******************************************************************************
 * Copyright (c) 2016
 * Author: Steve Legge
 * All rights reserved.
 *******************************************************************************/
package org.hamlookup.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.hamlookup.web.dao.PubaccAmDAO;
import org.hamlookup.web.dao.PubaccCoDAO;
import org.hamlookup.web.dao.PubaccEnDAO;
import org.hamlookup.web.dao.PubaccHdDAO;
import org.hamlookup.web.dao.PubaccHsDAO;
import org.hamlookup.web.dao.PubaccLaDAO;
import org.hamlookup.web.dao.PubaccScDAO;
import org.hamlookup.web.dao.PubaccSfDAO;
import org.hamlookup.web.model.PubaccAm;
import org.hamlookup.web.model.PubaccCo;
import org.hamlookup.web.model.PubaccEn;
import org.hamlookup.web.model.PubaccHd;
import org.hamlookup.web.model.PubaccHs;
import org.hamlookup.web.model.PubaccLa;
import org.hamlookup.web.model.PubaccSc;
import org.hamlookup.web.model.PubaccSf;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private PubaccHdDAO pubaccHdDao;
	
	@Autowired
	private PubaccAmDAO pubaccAmDao;
	
	@Autowired
	private PubaccEnDAO pubaccEnDao;
	
	@Autowired
	private PubaccHsDAO pubaccHsDao;

	@Autowired
	private PubaccCoDAO pubaccCoDao;
	
	@Autowired
	private PubaccScDAO pubaccScDao;

	@Autowired
	private PubaccSfDAO pubaccSfDao;
	
	@Autowired
	private PubaccLaDAO pubaccLaDao;	
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
		
	@RequestMapping("/nameTest")
	public ModelAndView handleNameRequest(HttpServletRequest request) throws ServletRequestBindingException {
	
		String name = ServletRequestUtils.getStringParameter(request, "name"); 
			
		List<PubaccHd> listPubaccHd = pubaccHdDao.nameTest(name);		
		
		ModelAndView model = new ModelAndView("pubaccHdList");
		model.addObject("pubaccHdList", listPubaccHd);
		return model;
	}
	
	
	@RequestMapping("/lessThan")
	public ModelAndView handleLessThanRequest(HttpServletRequest request) throws ServletRequestBindingException {
	
		int value = ServletRequestUtils.getIntParameter(request, "value"); 
			
		List<PubaccHd> listPubaccHd = pubaccHdDao.idLessThan(value);
		
		ModelAndView model = new ModelAndView("pubaccHdList");
		model.addObject("pubaccHdList", listPubaccHd);
		return model;
	}

	@RequestMapping("/fromHd")
	public ModelAndView handleFromHdRequest() throws Exception {
			
		List<PubaccHd> listPubaccHd = pubaccHdDao.fromHd();
		
		ModelAndView model = new ModelAndView("pubaccHdList");
		model.addObject("pubaccHdList", listPubaccHd);
		return model;
	}
	
	@RequestMapping("/amRecord")
	public ModelAndView handleAmRecordRequest(HttpServletRequest request) throws ServletRequestBindingException {
		
		int uid = ServletRequestUtils.getIntParameter(request, "uid"); 
				
		PubaccAm amRec = pubaccAmDao.get(uid);				
				
		ModelAndView model = new ModelAndView("pubaccAmList");
		model.addObject("pubaccAm", amRec);
		return model;
	}

	
	@RequestMapping("/sfRecord")
	public ModelAndView handleSfRecordRequest(HttpServletRequest request) throws ServletRequestBindingException {
		
		int uid = ServletRequestUtils.getIntParameter(request, "uid"); 
				
		PubaccSf sfRec = pubaccSfDao.get(uid);				
				
		ModelAndView model = new ModelAndView("pubaccSfList");
		model.addObject("pubaccSf", sfRec);
		return model;
	}
	
	@RequestMapping("/enRecord")
	public ModelAndView handleEnRecordRequest(HttpServletRequest request) throws ServletRequestBindingException {
		
		int uid = ServletRequestUtils.getIntParameter(request, "uid"); 
				
		PubaccEn enRec = pubaccEnDao.get(uid);				
				
		ModelAndView model = new ModelAndView("pubaccEnList");
		model.addObject("pubaccEn", enRec);
		return model;
	}


	@RequestMapping("/hsRecord")
	public ModelAndView handleHsRecordRequest(HttpServletRequest request) throws ServletRequestBindingException {
		
		int uid = ServletRequestUtils.getIntParameter(request, "uid"); 
				
		List<PubaccHs> listHsRec = pubaccHsDao.get(uid);				
		
		ModelAndView model = new ModelAndView("pubaccHsList");
		model.addObject("pubaccHsList", listHsRec);
		return model;
	}
	

	@RequestMapping("/scRecord")
	public ModelAndView handleScRecordRequest(HttpServletRequest request) throws ServletRequestBindingException {
		
		int uid = ServletRequestUtils.getIntParameter(request, "uid"); 
				
		List<PubaccSc> listScRec = pubaccScDao.get(uid);				
		
		ModelAndView model = new ModelAndView("pubaccScList");
		model.addObject("pubaccScList", listScRec);
		return model;
	}
	

	@RequestMapping("/laRecord")
	public ModelAndView handleLaRecordRequest(HttpServletRequest request) throws ServletRequestBindingException {
		
		int uid = ServletRequestUtils.getIntParameter(request, "uid"); 
				
		List<PubaccLa> listLaRec = pubaccLaDao.get(uid);				
				
		ModelAndView model = new ModelAndView("pubaccLaList");
		model.addObject("pubaccLaList", listLaRec);
		return model;
	}
	
	@RequestMapping("/coRecord")
	public ModelAndView handleCoRecordRequest(HttpServletRequest request) throws ServletRequestBindingException {
		
		int uid = ServletRequestUtils.getIntParameter(request, "uid"); 
				
		List<PubaccCo> listCoRec = pubaccCoDao.get(uid);				
						
		ModelAndView model = new ModelAndView("pubaccCoList");
		model.addObject("pubaccCoList", listCoRec);
		return model;
	}

	
	@RequestMapping("/firstName")
	public ModelAndView handleFirstNameRequest(HttpServletRequest request) throws ServletRequestBindingException {
	
		String name = ServletRequestUtils.getStringParameter(request, "name"); 
			
		List<PubaccHd> listPubaccHd = pubaccHdDao.firstName(name);
				
		ModelAndView model = new ModelAndView("pubaccHdList");
		model.addObject("pubaccHdList", listPubaccHd);
		return model;
	}
	

	@RequestMapping("/firstLast")
	public ModelAndView handleFirstLastRequest(HttpServletRequest request) throws ServletRequestBindingException {
	
		String first = ServletRequestUtils.getStringParameter(request, "first"); 
		String last = ServletRequestUtils.getStringParameter(request, "last");
			
		List<PubaccHd> listPubaccHd = pubaccHdDao.firstAndLast(first, last);		
		
		ModelAndView model = new ModelAndView("pubaccHdList");
		model.addObject("pubaccHdList", listPubaccHd);
		return model;
	}

	@RequestMapping("/fromHs")
	public ModelAndView handleFromHsRequest() throws Exception {
			
		List<PubaccHs> listPubaccHs = pubaccHsDao.fromHs();	
		
		ModelAndView model = new ModelAndView("pubaccHsList");
		model.addObject("pubaccHsList", listPubaccHs);
		return model;
	}
	
    // the default GET
    @RequestMapping(value={"find"})
    public ModelAndView findHamForm(HttpServletRequest request) throws Exception {

    	PubaccHd hdRec = new PubaccHd();
    	  	
    	return new ModelAndView("findHam")
    		.addObject("hdRec", hdRec);
    }

	
    @RequestMapping(value="findHam", method = RequestMethod.POST)
    public ModelAndView findHam(@ModelAttribute("hdRec") PubaccHd hdRec) throws Exception {
    	
    	List<PubaccHd> listPubaccHd = pubaccHdDao.findHam(hdRec);
    	
		ModelAndView model = new ModelAndView("pubaccHdList");
		model.addObject("pubaccHdList", listPubaccHd);
    	
    	if(listPubaccHd.size() == 1) {
    		
    		int uid = listPubaccHd.get(0).getUnique_system_identifier();
        	
        	PubaccAm amRec = pubaccAmDao.get(uid);
        	
        	List<PubaccCo> listPubaccCo = pubaccCoDao.get(uid);
        	PubaccEn enRec = pubaccEnDao.get(uid);
        	
        	List<PubaccHs> listPubaccHs = pubaccHsDao.get(uid);
        	List<PubaccLa> listPubaccLa = pubaccLaDao.get(uid);
        	List<PubaccSc> listPubaccSc = pubaccScDao.get(uid);
    
        	PubaccSf sfRec = pubaccSfDao.get(uid);
        	        	
    		model.addObject("pubaccScList", listPubaccSc);        	
    		model.addObject("pubaccHsList", listPubaccHs);
    		model.addObject("pubaccCoList", listPubaccCo);
    		model.addObject("pubaccLaList", listPubaccLa);
    		model.addObject("pubaccAm", amRec);
    		model.addObject("pubaccEn", enRec);
    		model.addObject("pubaccSf", sfRec);
    		
    	}
		
		return model;
    }
}
