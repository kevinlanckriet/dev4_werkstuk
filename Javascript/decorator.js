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
      return _.chunk(code, int).join("")};
  
  console.log(choise(3))