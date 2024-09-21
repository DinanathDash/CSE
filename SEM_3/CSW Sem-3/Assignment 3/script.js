// JavaScript for handling the + icon and contact form validation
document.addEventListener("DOMContentLoaded", function () {
    const detailsButtons = document.querySelectorAll(".show-details");
    const memberDetails = document.querySelectorAll(".member-details");
    const contactForm = document.getElementById("contact-form");
    const errorMessage = document.getElementById("error-message");

    detailsButtons.forEach((button, index) => {
        button.addEventListener("click", () => {
            memberDetails[index].classList.toggle("hidden");
        });
    });

    contactForm.addEventListener("submit", function (e) {
        e.preventDefault();

        const name = contactForm.elements.name.value;
        const email = contactForm.elements.email.value;
        const message = contactForm.elements.message.value;

        if (!name || !email || !message) {
            errorMessage.textContent = "This field is required";
            errorMessage.classList.remove("hidden");
        } else if (!isValidEmail(email)) {
            errorMessage.textContent = "Please use a valid email address";
            errorMessage.classList.remove("hidden");
        } else {
            errorMessage.classList.add("hidden");
            // Form submission logic here
        }
    });

    function isValidEmail(email) {
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailRegex.test(email);
    }
});

