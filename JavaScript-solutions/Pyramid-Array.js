function pyramid(n) {
    // your code here
    
    let result = []
    
    if(n === 0) {
      return result
    } 
    
    if(n !== 0) {
      for(let i = 1; i < n + 1; i++) {
        result.push([])
        for(let z = 1; z < i + 1; z++) {
          result[i - 1].push(1)
        }
      }
    }
    
    console.log("End")
    console.log(result)
    
    return result
    
  }