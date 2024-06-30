const getSeason = (month) => { 
  const seasons = {
    1: "Summer",
    2: "Summer",
    3: "Autumn",
    4: "Autumn",
    5: "Autumn",
    6: "Winter",
    7: "Winter",
    8: "Winter",
    9: "Spring",
    10: "Spring",
    11: "Spring",
    12: "Summer",
  }
  return seasons[month] || "Invalid month";
}

const month = 4;
console.log(getSeason(month)); // Autumn
