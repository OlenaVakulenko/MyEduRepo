@Circle
  Feature: Circle

    Scenario: 001 The area of a circle is r^2*Pi
      Given I create Circle with coordinates "0","0" and radius "9"
      Then Area of circle equals 254.34

     Scenario: 002 When I move the Circle it changes coordinates by certain step
       Given I create Circle with coordinates "0","0" and radius "9"
       When I move Circle by 1,2
       Then New coordinates are 1,2

     Scenario: 003 When I resize Circle its radius changes by coefficient
       Given I create Circle with coordinates "0","0" and radius "9"
       When I resize circle by coefficient 0.5
       Then Radius equals 4.5

      Scenario: 004 Circle is instance of Figure
        Given I create Circle with coordinates "0","0" and radius "9"
        Then Circle is instance of Figure