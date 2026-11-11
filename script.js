document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("profileForm");

    form.addEventListener("submit", function (event) {
        const studentId = document.getElementById("studentId").value.trim();
        const email = document.getElementById("email").value.trim();
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

        if (!studentId) {
            alert("[SECURITY CHECK FAILED]: Student ID is mandatory.");
            event.preventDefault();
            return;
        }

        if (!emailRegex.test(email)) {
            alert("[SECURITY CHECK FAILED]: Invalid target email format.");
            event.preventDefault();
            return;
        }
    });
});