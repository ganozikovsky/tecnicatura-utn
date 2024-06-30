const month = 4;

switch (month) {
  case 3:
  case 4:
  case 5:
    console.log("Spring");
    break;
  case 6:
  case 7:
  case 8:
    console.log("Summer");
    break;
  case 9:
  case 10:
  case 11:
    console.log("Autumn");
    break;
  default:
    console.log("Winter");
}

console.log(getSeason(month)); // Spring