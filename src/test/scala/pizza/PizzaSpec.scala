package pizza

import org.scalatest.FunSpec
import org.scalatest.GivenWhenThen

class PizzaSpec extends FunSpec with GivenWhenThen {

  var pizza: Pizza = _

  describe("A Pizza") {

    it("should start with no toppings") {
      Given("a new pizza")
      pizza = new Pizza

      Then("the topping count should be zero")
      assert(pizza.getToppings.size == 0)
    }

    it("should allow addition of toppings") {
      Given("a new pizza")
      pizza = new Pizza

      When("a topping is added")
      pizza.addTopping(Topping("green olives"))

      Then("the topping count should be incremented")
      assertResult(1) {
        pizza.getToppings.size
      }

      And("the topping should be what was added")
      val t = pizza.getToppings(0)
      assert(t === new Topping("green olives"))
    }

    it("should allow removal of toppings") {
      Given("a new pizza with one topping")
      pizza = new Pizza
      pizza.addTopping(Topping("green olives"))

      When("the topping is removed")
      pizza.removeTopping(Topping("green olives"))

      Then("the topping count should be zero")
      assertResult(0) {
        pizza.getToppings.size
      }
    }

    it("should be priced appropriately") (pending)

    // could've as easily used (pending) for this one
    ignore("should taste amazing") {
      Given("a new pizza with one topping")
      pizza = new Pizza
      pizza.addTopping(Topping("green olives"))

      When("eaten by the customer")
      // fill in after we define customer

      Then("it should taste amazing")
    }
  }

}