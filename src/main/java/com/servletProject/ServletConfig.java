package com.servletProject;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.servlet.GuiceServletContextListener;

/*
 * public class ServletConfig extends GuiceServletContextListener {
 * 
 * Injector injector; // Create Injector
 * 
 * @Override protected Injector getInjector() { injector =
 * Guice.createInjector(getModules()); return injector; }
 * 
 * // List of Modules for the Project. private List<Module> getModules(){
 * List<Module> modulesList = new ArrayList<Module>(); // modulesList.add(new
 * WebServletModule()); // modulesList.add(new WebAppModule()); return
 * modulesList; }
 * 
 * }
 */