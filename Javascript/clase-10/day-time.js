const hour = 22;

if (hour >= 9 && hour <= 11) {
  console.log("Working");
} else if (hour >= 12 && hour <= 16) {
  console.log("Still working");
} else if (hour >= 17 && hour <= 19) {
  console.log("Gym time");
} else if (hour >=19 && hour <= 23) {
  console.log("Studying");
} else {
  console.log("Sleeping");
}

