$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/addcart1.feature");
formatter.feature({
  "name": "To verify the addtocart functionality of the",
  "description": "  application",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launches phillipstoys application",
  "keyword": "Given "
});
formatter.match({
  "location": "addcartsteps.user_launches_phillipstoys_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the product in search box",
  "keyword": "When "
});
formatter.match({
  "location": "addcartsteps.user_enter_the_product_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "addcartsteps.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To add the product to add to cart page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user add the product to add to cart",
  "keyword": "When "
});
formatter.match({
  "location": "addcartsteps.user_add_the_product_to_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the add to cart page",
  "keyword": "Then "
});
formatter.match({
  "location": "addcartsteps.user_sees_the_add_to_cart_page()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launches phillipstoys application",
  "keyword": "Given "
});
formatter.match({
  "location": "addcartsteps.user_launches_phillipstoys_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the product in search box",
  "keyword": "When "
});
formatter.match({
  "location": "addcartsteps.user_enter_the_product_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "addcartsteps.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To increase the count of product in add to",
  "description": "    cart page",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user add the product to add to cart",
  "keyword": "When "
});
formatter.match({
  "location": "addcartsteps.user_add_the_product_to_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user increase the count in add to cart",
  "keyword": "And "
});
formatter.match({
  "location": "addcartsteps.user_increase_the_count_in_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the add to cart page with increase count",
  "keyword": "Then "
});
formatter.match({
  "location": "addcartsteps.user_sees_the_add_to_cart_page_with_increase_count()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/search.feature");
formatter.feature({
  "name": "To verify the search functionality of the application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@full"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launches phillipstoys application",
  "keyword": "Given "
});
formatter.match({
  "location": "addcartsteps.user_launches_phillipstoys_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the search relevance for the search functionality",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@full"
    },
    {
      "name": "@reg"
    }
  ]
});
formatter.step({
  "name": "user enter the product in search box",
  "keyword": "When "
});
formatter.match({
  "location": "addcartsteps.user_enter_the_product_in_search_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the search button",
  "keyword": "And "
});
formatter.match({
  "location": "addcartsteps.user_click_the_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the results based on selected product",
  "keyword": "Then "
});
formatter.match({
  "location": "addcartsteps.user_sees_the_results_based_on_selected_product()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To verify the search using category option",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click the category \"\u003ccategory\u003e\" in homepage",
  "keyword": "When "
});
formatter.step({
  "name": "user click the sub-category \"\u003csubcategory\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user sees the results based on \"\u003ccategory\u003e\" and \"\u003csubcategory\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "category",
        "subcategory"
      ]
    },
    {
      "cells": [
        "Toys",
        "Comic"
      ]
    },
    {
      "cells": [
        "Brand",
        "Peter Rabbit"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launches phillipstoys application",
  "keyword": "Given "
});
formatter.match({
  "location": "addcartsteps.user_launches_phillipstoys_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the search using category option",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@full"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click the category \"Toys\" in homepage",
  "keyword": "When "
});
formatter.match({
  "location": "searchsteps.user_click_the_category_in_homepage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the sub-category \"Comic\"",
  "keyword": "And "
});
formatter.match({
  "location": "searchsteps.user_click_the_sub_category(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the results based on \"Toys\" and \"Comic\"",
  "keyword": "Then "
});
formatter.match({
  "location": "searchsteps.user_sees_the_results_based_on_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "user launches phillipstoys application",
  "keyword": "Given "
});
formatter.match({
  "location": "addcartsteps.user_launches_phillipstoys_application()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To verify the search using category option",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@full"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user click the category \"Brand\" in homepage",
  "keyword": "When "
});
formatter.match({
  "location": "searchsteps.user_click_the_category_in_homepage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click the sub-category \"Peter Rabbit\"",
  "keyword": "And "
});
formatter.match({
  "location": "searchsteps.user_click_the_sub_category(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user sees the results based on \"Brand\" and \"Peter Rabbit\"",
  "keyword": "Then "
});
formatter.match({
  "location": "searchsteps.user_sees_the_results_based_on_and(String,String)"
});
formatter.result({
  "status": "passed"
});
});