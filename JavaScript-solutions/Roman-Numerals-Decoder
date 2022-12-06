function solution (roman) {
  // complete the solution by transforming the 
  // string roman numeral into an integer
  
  let result = 0
  
  function numberTranslator (RNum) {
    let num = 0
    
    switch (RNum) {
      case "I":
        num = 1
        break;
      case "V":
        num = 5
        break;
      case "X":
         num = 10
        break;
      case "L":
        num = 50
        break;
      case "C":
        num = 100
        break;
      case "D":
        num = 500
        break;
      case "M":
        num = 1000
    }
    
    return num
  }
  
  for(let i = 0; i < roman.length; i++) {
    
    if(numberTranslator(roman[i]) < numberTranslator(roman[i + 1])) {
       result = result + numberTranslator(roman[i + 1]) - numberTranslator(roman[i])
       i++
       console.log(roman[i] + roman[i + 1] + ' = ' + numberTranslator(roman[i + 1]) - numberTranslator(roman[i]))
    } else {
      console.log(roman[i] + ' = ' + numberTranslator(roman[i]))
      result = result + numberTranslator(roman[i])
    }
    
  }
  
  return result
    
}