const trims = {TrimLevels:[
    { name: "base setup", code: "BA"},
    { name: "level1",code: "U1"},
    { name: "level2",code:"U2"}
  ]};
  
  const data = trims.TrimLevels
  
  console.log(data)
  
  const code = data.map( (trimlevel) => `${trimlevel.code}`
    );
  
  console.log(code)
  
  const choise = (int) => {
    return _.head(_.chunk(code, int+1)).join("")};
  
  console.log(choise(0))
  console.log(choise(1))
  console.log(choise(2)))