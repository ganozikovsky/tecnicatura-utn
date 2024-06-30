const getDay = (day) => {
  const days = ["Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"];
  return days[day - 1] || "Invalid day";
}

console.log(getDay(4)); // Thursday