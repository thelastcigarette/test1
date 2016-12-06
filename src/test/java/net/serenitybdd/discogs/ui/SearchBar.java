package net.serenitybdd.discogs.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.discogs.model.Category;

/**
 * Created by jmcfarla on 12/5/16.
 */
public class SearchBar extends PageObject{
    public void typeRequest(Category category){
        $("#search_q").click();
        $("#search_q").type(category.name());
        $("#do_site_search").click();
    }
}
