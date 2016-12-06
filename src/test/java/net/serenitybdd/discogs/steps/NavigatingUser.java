package net.serenitybdd.discogs.steps;

import net.serenitybdd.discogs.model.Category;
import net.serenitybdd.discogs.ui.CurrentPage;
import net.serenitybdd.discogs.ui.DiscogsHomePage;
import net.serenitybdd.discogs.ui.SearchBar;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by jmcfarla on 12/5/16.
 */
public class NavigatingUser {

    DiscogsHomePage discogsHomePage;
    CurrentPage currentPage;
    SearchBar searchBar;

    @Step
    public void isOnTheHomePage() {
        discogsHomePage.open();
    }

    @Step
    public void shouldSeePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }

    @Step
    public void searchesForARecord(Category category) {
        searchBar.typeRequest(category);

    }
}
