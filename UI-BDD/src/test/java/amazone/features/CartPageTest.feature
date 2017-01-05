@CartPage
  Feature: CartPage

    Scenario: 001 When I add products to cart they appear in cart with correct price
      When I add product1 to cart
      And I add product2 to cart
      Then I see titles of these products in the cart
      And Total price equals to product1 price plus product2 price

     Scenario: 002 When I delete product from cart it disappears from cart
       When I add product1 to cart
       And I add product2 to cart
       And  I add product3 to cart
       And I delete third product from cart
       Then This product is not present in the cart