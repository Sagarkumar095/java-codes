function calculateAge() {
    var dob = document.getElementById("dob").value;
    var dobDate = new Date(dob);
    var todayDate = new Date();
    var age = todayDate.getFullYear() - dobDate.getFullYear();
    var month = todayDate.getMonth() - dobDate.getMonth();
    if (month < 0 || (month === 0 && todayDate.getDate() < dobDate.getDate())) {
        age--;
        month += 12;
    }
    var totalMonths = (age*12) + month;
    document.getElementById("result").innerHTML = "Your age is " + age + " years and " + month + " months old. Total Months: " + totalMonths;
}
