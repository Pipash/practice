const combinations = (elements) => {
  //console.log(elements.length);
  if (elements.length === 0) {
    return [[]];
  }
  const firstElement = elements[0];
  const rest = elements.slice(1);
  const combsWithoutFirst = combinations(rest);
  const combsWithFirst = [];
  combsWithoutFirst.forEach(comb => {
    combsWithFirst.push([...comb, firstElement]);
  });

  return [...combsWithoutFirst, ...combsWithFirst];
}

combinations(['a', 'b', 'c'])
