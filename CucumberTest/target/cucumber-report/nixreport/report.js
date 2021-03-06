$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("testCircle.feature");
formatter.feature({
  "line": 2,
  "name": "Circle",
  "description": "",
  "id": "circle",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Circle"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "001 The area of a circle is r^2*Pi",
  "description": "",
  "id": "circle;001-the-area-of-a-circle-is-r^2*pi",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Non-static"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I create Circle with coordinates \"0\",\"0\" and radius \"9\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Area of circle equals 254.34",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 34
    },
    {
      "val": "0",
      "offset": 38
    },
    {
      "val": "9",
      "offset": 53
    }
  ],
  "location": "CircleStepdefs.iCreateCircleWithCoordinatesAndRadius(String,String,String)"
});
formatter.result({
  "duration": 247378507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "254.34",
      "offset": 22
    }
  ],
  "location": "CircleStepdefs.areaOfCircleEquals(double)"
});
formatter.result({
  "duration": 4667971,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "002 When I move the Circle it changes coordinates by certain step",
  "description": "",
  "id": "circle;002-when-i-move-the-circle-it-changes-coordinates-by-certain-step",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Non-static"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I create Circle with coordinates \"0\",\"0\" and radius \"9\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I move Circle by 1,2",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "New coordinates are 1,2",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 34
    },
    {
      "val": "0",
      "offset": 38
    },
    {
      "val": "9",
      "offset": 53
    }
  ],
  "location": "CircleStepdefs.iCreateCircleWithCoordinatesAndRadius(String,String,String)"
});
formatter.result({
  "duration": 188156,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    },
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "CircleStepdefs.iMoveCircleBy(double,double)"
});
formatter.result({
  "duration": 330698,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 20
    },
    {
      "val": "2",
      "offset": 22
    }
  ],
  "location": "CircleStepdefs.newCoordinatesAre(double,double)"
});
formatter.result({
  "duration": 2373612,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "003 When I resize Circle its radius changes by coefficient",
  "description": "",
  "id": "circle;003-when-i-resize-circle-its-radius-changes-by-coefficient",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Non-static"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I create Circle with coordinates \"0\",\"0\" and radius \"9\"",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I resize circle by coefficient 0.5",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Radius equals 4.5",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 34
    },
    {
      "val": "0",
      "offset": 38
    },
    {
      "val": "9",
      "offset": 53
    }
  ],
  "location": "CircleStepdefs.iCreateCircleWithCoordinatesAndRadius(String,String,String)"
});
formatter.result({
  "duration": 225216,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.5",
      "offset": 31
    }
  ],
  "location": "CircleStepdefs.iResizeCircleByCoefficient(double)"
});
formatter.result({
  "duration": 186445,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4.5",
      "offset": 14
    }
  ],
  "location": "CircleStepdefs.radiusEquals(double)"
});
formatter.result({
  "duration": 165919,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "004 Circle is instance of Figure",
  "description": "",
  "id": "circle;004-circle-is-instance-of-figure",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Non-static"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I create Circle with coordinates \"0\",\"0\" and radius \"9\"",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Circle is instance of Figure",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 34
    },
    {
      "val": "0",
      "offset": 38
    },
    {
      "val": "9",
      "offset": 53
    }
  ],
  "location": "CircleStepdefs.iCreateCircleWithCoordinatesAndRadius(String,String,String)"
});
formatter.result({
  "duration": 305610,
  "status": "passed"
});
formatter.match({
  "location": "CircleStepdefs.circleIsInstanceOfFigure()"
});
formatter.result({
  "duration": 64429,
  "status": "passed"
});
formatter.uri("testMatrix.feature");
formatter.feature({
  "line": 2,
  "name": "Matrix",
  "description": "",
  "id": "matrix",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "001 When I create Matrix the program returns object Matrix",
  "description": "",
  "id": "matrix;001-when-i-create-matrix-the-program-returns-object-matrix",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I returns Matrix",
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 19548803,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 246313,
  "status": "passed"
});
formatter.match({
  "location": "MatrixStepdefs.iReturnsMatrix()"
});
formatter.result({
  "duration": 60438,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "003 Input Validation",
  "description": "",
  "id": "matrix;003-input-validation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I validate string \"j\"",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Validation doesn\u0027t pass",
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 66710,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "j",
      "offset": 19
    }
  ],
  "location": "MatrixStepdefs.iValidateString(String)"
});
formatter.result({
  "duration": 311312,
  "status": "passed"
});
formatter.match({
  "location": "MatrixStepdefs.validationDoesnTPass()"
});
formatter.result({
  "duration": 55877,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 14,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row \u003crow\u003e and position \u003ccolumn\u003e with value \u003citem\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;",
  "rows": [
    {
      "cells": [
        "row",
        "column",
        "item"
      ],
      "line": 19,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;1"
    },
    {
      "cells": [
        "0",
        "0",
        "1"
      ],
      "line": 20,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;2"
    },
    {
      "cells": [
        "0",
        "1",
        "2"
      ],
      "line": 21,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;3"
    },
    {
      "cells": [
        "0",
        "2",
        "3"
      ],
      "line": 22,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;4"
    },
    {
      "cells": [
        "0",
        "3",
        "4"
      ],
      "line": 23,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;5"
    },
    {
      "cells": [
        "0",
        "4",
        "5"
      ],
      "line": 24,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;6"
    },
    {
      "cells": [
        "1",
        "0",
        "6"
      ],
      "line": 25,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;7"
    },
    {
      "cells": [
        "1",
        "1",
        "7"
      ],
      "line": 26,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;8"
    },
    {
      "cells": [
        "1",
        "2",
        "8"
      ],
      "line": 27,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;9"
    },
    {
      "cells": [
        "1",
        "3",
        "9"
      ],
      "line": 28,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;10"
    },
    {
      "cells": [
        "1",
        "4",
        "1"
      ],
      "line": 29,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;11"
    },
    {
      "cells": [
        "2",
        "0",
        "2"
      ],
      "line": 30,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;12"
    },
    {
      "cells": [
        "2",
        "1",
        "3"
      ],
      "line": 31,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;13"
    },
    {
      "cells": [
        "2",
        "2",
        "4"
      ],
      "line": 32,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;14"
    },
    {
      "cells": [
        "2",
        "3",
        "5"
      ],
      "line": 33,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;15"
    },
    {
      "cells": [
        "2",
        "4",
        "6"
      ],
      "line": 34,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;16"
    },
    {
      "cells": [
        "3",
        "0",
        "7"
      ],
      "line": 35,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;17"
    },
    {
      "cells": [
        "3",
        "1",
        "8"
      ],
      "line": 36,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;18"
    },
    {
      "cells": [
        "3",
        "2",
        "9"
      ],
      "line": 37,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;19"
    },
    {
      "cells": [
        "3",
        "3",
        "1"
      ],
      "line": 38,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;20"
    },
    {
      "cells": [
        "3",
        "4",
        "2"
      ],
      "line": 39,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;21"
    },
    {
      "cells": [
        "4",
        "0",
        "3"
      ],
      "line": 40,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;22"
    },
    {
      "cells": [
        "4",
        "1",
        "4"
      ],
      "line": 41,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;23"
    },
    {
      "cells": [
        "4",
        "2",
        "5"
      ],
      "line": 42,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;24"
    },
    {
      "cells": [
        "4",
        "3",
        "6"
      ],
      "line": 43,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;25"
    },
    {
      "cells": [
        "4",
        "4",
        "7"
      ],
      "line": 44,
      "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;26"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 20,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 0 and position 0 with value 1",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 69561,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 142542,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 30
    },
    {
      "val": "0",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 249164,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 0 and position 1 with value 2",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 84955,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 145963,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 30
    },
    {
      "val": "1",
      "offset": 45
    },
    {
      "val": "2",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 227497,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 0 and position 2 with value 3",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 63859,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 136841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 30
    },
    {
      "val": "2",
      "offset": 45
    },
    {
      "val": "3",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 230348,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 0 and position 3 with value 4",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 66710,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 141972,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 30
    },
    {
      "val": "3",
      "offset": 45
    },
    {
      "val": "4",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 242892,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 0 and position 4 with value 5",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 66709,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 147103,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 30
    },
    {
      "val": "4",
      "offset": 45
    },
    {
      "val": "5",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 211532,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 1 and position 0 with value 6",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 67850,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 151665,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    },
    {
      "val": "0",
      "offset": 45
    },
    {
      "val": "6",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 3497415,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 1 and position 1 with value 7",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 119165,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 146533,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    },
    {
      "val": "1",
      "offset": 45
    },
    {
      "val": "7",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 266269,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;9",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 1 and position 2 with value 8",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 80393,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 651132,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    },
    {
      "val": "2",
      "offset": 45
    },
    {
      "val": "8",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 783412,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;10",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 1 and position 3 with value 9",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 69561,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 139691,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    },
    {
      "val": "3",
      "offset": 45
    },
    {
      "val": "9",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 257146,
  "status": "passed"
});
formatter.scenario({
  "line": 29,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;11",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 1 and position 4 with value 1",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 71841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 132279,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 30
    },
    {
      "val": "4",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 236050,
  "status": "passed"
});
formatter.scenario({
  "line": 30,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;12",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 2 and position 0 with value 2",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 63289,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 134560,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 30
    },
    {
      "val": "0",
      "offset": 45
    },
    {
      "val": "2",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 294207,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;13",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 2 and position 1 with value 3",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 71841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 147104,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 30
    },
    {
      "val": "1",
      "offset": 45
    },
    {
      "val": "3",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 246883,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;14",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 2 and position 2 with value 4",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 72411,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 136270,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 30
    },
    {
      "val": "2",
      "offset": 45
    },
    {
      "val": "4",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 276532,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;15",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 2 and position 3 with value 5",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 2904440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 158507,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 30
    },
    {
      "val": "3",
      "offset": 45
    },
    {
      "val": "5",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 607229,
  "status": "passed"
});
formatter.scenario({
  "line": 34,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;16",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 2 and position 4 with value 6",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 86095,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 2106773,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 30
    },
    {
      "val": "4",
      "offset": 45
    },
    {
      "val": "6",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 1632963,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;17",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 3 and position 0 with value 7",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 61008,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 233769,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 30
    },
    {
      "val": "0",
      "offset": 45
    },
    {
      "val": "7",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 1081610,
  "status": "passed"
});
formatter.scenario({
  "line": 36,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;18",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 3 and position 1 with value 8",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 53596,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 148814,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 30
    },
    {
      "val": "1",
      "offset": 45
    },
    {
      "val": "8",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 257716,
  "status": "passed"
});
formatter.scenario({
  "line": 37,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;19",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 3 and position 2 with value 9",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 54166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 124297,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 30
    },
    {
      "val": "2",
      "offset": 45
    },
    {
      "val": "9",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 226357,
  "status": "passed"
});
formatter.scenario({
  "line": 38,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;20",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 3 and position 3 with value 1",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 62149,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 148244,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 30
    },
    {
      "val": "3",
      "offset": 45
    },
    {
      "val": "1",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 240041,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;21",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 3 and position 4 with value 2",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 59298,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 147674,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 30
    },
    {
      "val": "4",
      "offset": 45
    },
    {
      "val": "2",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 224076,
  "status": "passed"
});
formatter.scenario({
  "line": 40,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;22",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 4 and position 0 with value 3",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 63858,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 147674,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 30
    },
    {
      "val": "0",
      "offset": 45
    },
    {
      "val": "3",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 215524,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;23",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 4 and position 1 with value 4",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 56447,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 126578,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 30
    },
    {
      "val": "1",
      "offset": 45
    },
    {
      "val": "4",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 238900,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;24",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 4 and position 2 with value 5",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 47894,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 114604,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 30
    },
    {
      "val": "2",
      "offset": 45
    },
    {
      "val": "5",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 235480,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;25",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 4 and position 3 with value 6",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 57017,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 140832,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 30
    },
    {
      "val": "3",
      "offset": 45
    },
    {
      "val": "6",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 254866,
  "status": "passed"
});
formatter.scenario({
  "line": 44,
  "name": "002 When I create Matrix I receive Matrix of certain Pattern",
  "description": "",
  "id": "matrix;002-when-i-create-matrix-i-receive-matrix-of-certain-pattern;;26",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Matrix"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "I start program Matrix",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 5",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I see on return matrix in row 4 and position 4 with value 7",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "MatrixStepdefs.WhenICreateMatrixProgramReturnsObjectMatrix()"
});
formatter.result({
  "duration": 56447,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 132279,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 30
    },
    {
      "val": "4",
      "offset": 45
    },
    {
      "val": "7",
      "offset": 58
    }
  ],
  "location": "MatrixStepdefs.iSeeOnReturnMatrixInRowAndPositionWithValue(int,int,int)"
});
formatter.result({
  "duration": 232629,
  "status": "passed"
});
formatter.uri("testPalindrom.feature");
formatter.feature({
  "line": 3,
  "name": "Palindrom",
  "description": "",
  "id": "palindrom",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Palindrom"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "001 When I reverse string I get string written backwards",
  "description": "",
  "id": "palindrom;001-when-i-reverse-string-i-get-string-written-backwards",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I reverse string \"abcdef\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Reversed string is \"fedcba\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "abcdef",
      "offset": 18
    }
  ],
  "location": "PalindromStepdefs.iReverseString(String)"
});
formatter.result({
  "duration": 42470153,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fedcba",
      "offset": 20
    }
  ],
  "location": "PalindromStepdefs.reversedStringIs(String)"
});
formatter.result({
  "duration": 387715,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "002 Check if the Word is Palindrom",
  "description": "",
  "id": "palindrom;002-check-if-the-word-is-palindrom",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "I check string with value \"\u003cstring\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I get the result \"\u003cresult\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "palindrom;002-check-if-the-word-is-palindrom;",
  "rows": [
    {
      "cells": [
        "string",
        "result"
      ],
      "line": 13,
      "id": "palindrom;002-check-if-the-word-is-palindrom;;1"
    },
    {
      "cells": [
        "pop",
        "True"
      ],
      "line": 14,
      "id": "palindrom;002-check-if-the-word-is-palindrom;;2"
    },
    {
      "cells": [
        "Level",
        "True"
      ],
      "line": 15,
      "id": "palindrom;002-check-if-the-word-is-palindrom;;3"
    },
    {
      "cells": [
        "moon",
        "False"
      ],
      "line": 16,
      "id": "palindrom;002-check-if-the-word-is-palindrom;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "002 Check if the Word is Palindrom",
  "description": "",
  "id": "palindrom;002-check-if-the-word-is-palindrom;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Palindrom"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I check string with value \"pop\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I get the result \"True\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "pop",
      "offset": 27
    }
  ],
  "location": "PalindromStepdefs.iCheckStringWithValue(String)"
});
formatter.result({
  "duration": 226927,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "True",
      "offset": 18
    }
  ],
  "location": "PalindromStepdefs.iGetTheResult(String)"
});
formatter.result({
  "duration": 187015,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "002 Check if the Word is Palindrom",
  "description": "",
  "id": "palindrom;002-check-if-the-word-is-palindrom;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Palindrom"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I check string with value \"Level\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I get the result \"True\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Level",
      "offset": 27
    }
  ],
  "location": "PalindromStepdefs.iCheckStringWithValue(String)"
});
formatter.result({
  "duration": 156796,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "True",
      "offset": 18
    }
  ],
  "location": "PalindromStepdefs.iGetTheResult(String)"
});
formatter.result({
  "duration": 127717,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "002 Check if the Word is Palindrom",
  "description": "",
  "id": "palindrom;002-check-if-the-word-is-palindrom;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Palindrom"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I check string with value \"moon\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I get the result \"False\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "moon",
      "offset": 27
    }
  ],
  "location": "PalindromStepdefs.iCheckStringWithValue(String)"
});
formatter.result({
  "duration": 4121749,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "False",
      "offset": 18
    }
  ],
  "location": "PalindromStepdefs.iGetTheResult(String)"
});
formatter.result({
  "duration": 131709,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "003 Check if the Phrese is Palindrom",
  "description": "",
  "id": "palindrom;003-check-if-the-phrese-is-palindrom",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "I check phrase with value \"\u003cphrase\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I get the output \"\u003coutput\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "palindrom;003-check-if-the-phrese-is-palindrom;",
  "rows": [
    {
      "cells": [
        "phrase",
        "output"
      ],
      "line": 22,
      "id": "palindrom;003-check-if-the-phrese-is-palindrom;;1"
    },
    {
      "cells": [
        "A man a plan a canal Panama",
        "True"
      ],
      "line": 23,
      "id": "palindrom;003-check-if-the-phrese-is-palindrom;;2"
    },
    {
      "cells": [
        "Man a plan a canal Panama",
        "False"
      ],
      "line": 24,
      "id": "palindrom;003-check-if-the-phrese-is-palindrom;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "003 Check if the Phrese is Palindrom",
  "description": "",
  "id": "palindrom;003-check-if-the-phrese-is-palindrom;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Palindrom"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I check phrase with value \"A man a plan a canal Panama\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I get the output \"True\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "A man a plan a canal Panama",
      "offset": 27
    }
  ],
  "location": "PalindromStepdefs.iCheckPhraseWithValue(String)"
});
formatter.result({
  "duration": 224076,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "True",
      "offset": 18
    }
  ],
  "location": "PalindromStepdefs.iGetTheOutput(String)"
});
formatter.result({
  "duration": 116314,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "003 Check if the Phrese is Palindrom",
  "description": "",
  "id": "palindrom;003-check-if-the-phrese-is-palindrom;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Palindrom"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I check phrase with value \"Man a plan a canal Panama\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I get the output \"False\"",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Man a plan a canal Panama",
      "offset": 27
    }
  ],
  "location": "PalindromStepdefs.iCheckPhraseWithValue(String)"
});
formatter.result({
  "duration": 247453,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "False",
      "offset": 18
    }
  ],
  "location": "PalindromStepdefs.iGetTheOutput(String)"
});
formatter.result({
  "duration": 88376,
  "status": "passed"
});
formatter.uri("testSnail.feature");
formatter.feature({
  "line": 2,
  "name": "Snail",
  "description": "",
  "id": "snail",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Snail"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "002 Position of Max element in Matrix with odd size",
  "description": "",
  "id": "snail;002-position-of-max-element-in-matrix-with-odd-size",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I start program Snail",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I create matrix with side value 5",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "current position of maximum element is 0,4",
  "keyword": "Then "
});
formatter.match({
  "location": "SnailStepdefs.iStartProgramSnail()"
});
formatter.result({
  "duration": 65984479,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 32
    }
  ],
  "location": "SnailStepdefs.iCreateMatrixWithSideValue(int)"
});
formatter.result({
  "duration": 635168,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 39
    },
    {
      "val": "4",
      "offset": 41
    }
  ],
  "location": "SnailStepdefs.currentPositionOfMaximumElementIs(int,int)"
});
formatter.result({
  "duration": 1019461,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "003 Position of Max element in Matrix with even size",
  "description": "",
  "id": "snail;003-position-of-max-element-in-matrix-with-even-size",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I start program Snail",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I create matrix with side value 4",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "current position of maximum element is 3,0",
  "keyword": "Then "
});
formatter.match({
  "location": "SnailStepdefs.iStartProgramSnail()"
});
formatter.result({
  "duration": 89516,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 32
    }
  ],
  "location": "SnailStepdefs.iCreateMatrixWithSideValue(int)"
});
formatter.result({
  "duration": 354645,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 39
    },
    {
      "val": "0",
      "offset": 41
    }
  ],
  "location": "SnailStepdefs.currentPositionOfMaximumElementIs(int,int)"
});
formatter.result({
  "duration": 174472,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "004 Snail returns Martix with particular size",
  "description": "",
  "id": "snail;004-snail-returns-martix-with-particular-size",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "I start program Snail",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "I create matrix with size 3",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "program returns Matrix with size 3",
  "keyword": "Then "
});
formatter.match({
  "location": "SnailStepdefs.iStartProgramSnail()"
});
formatter.result({
  "duration": 71841,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 26
    }
  ],
  "location": "MatrixStepdefs.iCreateMatrixWithSize(int)"
});
formatter.result({
  "duration": 144253,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 33
    }
  ],
  "location": "SnailStepdefs.programReturnsMatrixWithSize(int)"
});
formatter.result({
  "duration": 472670,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "001 Max element in Matrix",
  "description": "",
  "id": "snail;001-max-element-in-matrix",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@SnailSpecial"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "I create matrix with side value 5",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "current maximum element is 25",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 32
    }
  ],
  "location": "SnailStepdefs.iCreateMatrixWithSideValue(int)"
});
formatter.result({
  "duration": 424776,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "25",
      "offset": 27
    }
  ],
  "location": "SnailStepdefs.currentMaximumElementIs(int)"
});
formatter.result({
  "duration": 136270,
  "status": "passed"
});
formatter.uri("testSquare.feature");
formatter.feature({
  "line": 2,
  "name": "Square",
  "description": "",
  "id": "square",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Square"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "001 The area of a square is side^2",
  "description": "",
  "id": "square;001-the-area-of-a-square-is-side^2",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Non-static"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I create Square with side 9 and coordinates 0,0",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Area of Square equals 81",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 26
    },
    {
      "val": "0",
      "offset": 44
    },
    {
      "val": "0",
      "offset": 46
    }
  ],
  "location": "SquareStepdefs.iCreateSquareWithSideAndCoordinates(double,double,double)"
});
formatter.result({
  "duration": 1554850,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "81",
      "offset": 22
    }
  ],
  "location": "SquareStepdefs.areaOfSquareEquals(double)"
});
formatter.result({
  "duration": 184165,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "002 When I move the Square it changes coordinates by certain step",
  "description": "",
  "id": "square;002-when-i-move-the-square-it-changes-coordinates-by-certain-step",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@Non-static"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "I create Square with side 9 and coordinates 0,0",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I move Square by 1,2",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "New Square coordinates are 1,2",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 26
    },
    {
      "val": "0",
      "offset": 44
    },
    {
      "val": "0",
      "offset": 46
    }
  ],
  "location": "SquareStepdefs.iCreateSquareWithSideAndCoordinates(double,double,double)"
});
formatter.result({
  "duration": 299339,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 17
    },
    {
      "val": "2",
      "offset": 19
    }
  ],
  "location": "SquareStepdefs.iMoveSquareBy(double,double)"
});
formatter.result({
  "duration": 230348,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 27
    },
    {
      "val": "2",
      "offset": 29
    }
  ],
  "location": "SquareStepdefs.newSquareCoordinatesAre(double,double)"
});
formatter.result({
  "duration": 316444,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "003 When I resize Square its side changes by coefficient",
  "description": "",
  "id": "square;003-when-i-resize-square-its-side-changes-by-coefficient",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@Non-static"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I create Square with side 9 and coordinates 0,0",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I resize square by coefficient 0.5",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "Side equals 4.5",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 26
    },
    {
      "val": "0",
      "offset": 44
    },
    {
      "val": "0",
      "offset": 46
    }
  ],
  "location": "SquareStepdefs.iCreateSquareWithSideAndCoordinates(double,double,double)"
});
formatter.result({
  "duration": 268549,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0.5",
      "offset": 31
    }
  ],
  "location": "SquareStepdefs.iResizeSquareByCoefficient(double)"
});
formatter.result({
  "duration": 162498,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4.5",
      "offset": 12
    }
  ],
  "location": "SquareStepdefs.sideEquals(double)"
});
formatter.result({
  "duration": 131139,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "004 Square is instance of Figure",
  "description": "",
  "id": "square;004-square-is-instance-of-figure",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@Non-static"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I create Square with side 9 and coordinates 0,0",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "Square is instance of Figure",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 26
    },
    {
      "val": "0",
      "offset": 44
    },
    {
      "val": "0",
      "offset": 46
    }
  ],
  "location": "SquareStepdefs.iCreateSquareWithSideAndCoordinates(double,double,double)"
});
formatter.result({
  "duration": 598677,
  "status": "passed"
});
formatter.match({
  "location": "SquareStepdefs.circleIsInstanceOfFigure()"
});
formatter.result({
  "duration": 143683,
  "status": "passed"
});
});