package net.serenitybdd.discogs.features.search;

import net.serenitybdd.discogs.model.Category;
import net.serenitybdd.discogs.steps.NavigatingUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.when;

/**
 * Created by jmcfarla on 12/5/16.
 */
        @RunWith(SerenityRunner.class)
        public class WhenBrowsingRecords {


        @Steps
        NavigatingUser jim;

        @Managed
        WebDriver browser;


        @Test
        public void shouldBeAbleToSearchForUi(){
                //Given
                jim.isOnTheHomePage();

                //When
                jim.searchesForARecord(Category.Ui_Sidelong);

                //Then
                jim.shouldSeePageTitleContaining("Searching for \"ui_sidelong\"");
        }

        @Test
        public void shouldBeAbleToSearchSidelong(){
                Actor james = Actor.named("James");
                james.can(BrowseTheWeb.with(browser));

                when(james).attemptsTo(NavigateTo.);


    }

}
