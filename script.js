// Greeting stuff
const currentHour = new Date().getHours();

let greeting;
let greetingTime;
if (currentHour < 12) {
  greetingTime = "Morning";
} else if (currentHour < 17) {
  greetingTime = "Afternoon";
} else {
  greetingTime = "Evening";
}

const greetingElement = document.getElementById("greeting");
if (greetingElement) {
  greetingElement.textContent = greeting;
}

// Set initial greeting (no name)
setGreeting();

// Navigation functionality
function showPage(pageName) {
  // Make them all inactive
  document.querySelectorAll(".nav-item").forEach((item) => {
    item.classList.remove("active");
  });

  // Add active class to clicked item
  event.target.closest(".nav-item").classList.add("active");

  // Hide all content sections
  document.querySelectorAll(".page-content").forEach((page) => {
    page.style.display = "none";
  });

  document.getElementById(pageName).style.display = "block";

  console.log("Switched to:", pageName);
}

// Plus button functionality with modal
document.addEventListener("DOMContentLoaded", function () {
  const plusButton = document.querySelector(".plus-icon");
  const loginModal = document.getElementById("loginModal");

  if (plusButton) {
    plusButton.addEventListener("click", function () {
      // Check if user is logged in (you'll need to implement actual auth check)
      const isLoggedIn = false; // Change this to your actual auth check

      if (!isLoggedIn) {
        // Show modal instead of alert
        if (loginModal) {
          loginModal.style.display = "flex";
        } else {
          alert("Please log in or sign up to start a workout!");
        }
      } else {
        // User is logged in - proceed with workout creation
        console.log("User is logged in, starting workout...");
        // Add your workout creation logic here
      }
    });
  }

  // Close modal when clicking outside
  if (loginModal) {
    loginModal.addEventListener("click", function (e) {
      if (e.target === loginModal) {
        loginModal.style.display = "none";
      }
    });
  }
});

// Auth state management
let currentUser = null;

// Check if user is logged in (from localStorage)
function checkAuthStatus() {
  const userData = localStorage.getItem("fitTrackerUser");
  if (userData) {
    currentUser = JSON.parse(userData);
    updateUIForLoggedInUser();
  }
  return currentUser !== null;
}

// Update UI when user logs in
function updateUIForLoggedInUser() {
  const authButtons = document.querySelector(".auth-buttons");
  if (authButtons && currentUser) {
    // Only show logout button styled like login/signup
    authButtons.innerHTML = `
      <button class="logout-btn login-btn">Log Out</button>
    `;
    // Update greeting with first name
    setGreeting(currentUser.name);
    // Add logout functionality
    const logoutBtn = authButtons.querySelector(".logout-btn");
    if (logoutBtn) {
      logoutBtn.addEventListener("click", logout);
    }
    attachAuthButtonListeners();
  }
}

// Login function
function login(email, password) {
  const users = JSON.parse(localStorage.getItem("fitTrackerUsers") || "[]");
  const user = users.find((u) => u.email === email && u.password === password);

  if (user) {
    currentUser = user;
    localStorage.setItem("fitTrackerUser", JSON.stringify(user));
    updateUIForLoggedInUser();
    closeAllModals();
    // alert(`Welcome back, ${user.name}!`);
    return true;
  } else {
    alert("Invalid email or password");
    return false;
  }
}

// Signup function
function signup(name, email, password, confirmPassword) {
  if (password !== confirmPassword) {
    alert("Passwords do not match");
    return false;
  }

  if (password.length < 6) {
    alert("Password must be at least 6 characters");
    return false;
  }

  const users = JSON.parse(localStorage.getItem("fitTrackerUsers") || "[]");
  if (users.find((u) => u.email === email)) {
    alert("User with this email already exists");
    return false;
  }

  const newUser = {
    id: Date.now(),
    name: name,
    email: email,
    password: password,
    joinDate: new Date().toISOString(),
  };

  users.push(newUser);
  localStorage.setItem("fitTrackerUsers", JSON.stringify(users));
  localStorage.setItem("fitTrackerUser", JSON.stringify(newUser));
  currentUser = newUser;

  updateUIForLoggedInUser();
  closeAllModals();
  alert(`Welcome to FitTracker, ${name}!`);
  return true;
}

// Logout function
function logout() {
  currentUser = null;
  localStorage.removeItem("fitTrackerUser");

  const authButtons = document.querySelector(".auth-buttons");
  if (authButtons) {
    authButtons.innerHTML = `
      <button class="login-btn">Log in</button>
      <button class="signup-btn">Sign up</button>
    `;
    attachAuthButtonListeners();
  }
  // Reset greeting to generic
  setGreeting();
  alert("You have been logged out");
}

// Modal management
function showLoginModal() {
  closeAllModals();
  const loginModal = document.getElementById("loginModal");
  if (loginModal) {
    loginModal.style.display = "flex";
  }
}

function showSignupModal() {
  closeAllModals();
  const signupModal = document.getElementById("signupModal");
  if (signupModal) {
    signupModal.style.display = "flex";
  }
}

function closeAllModals() {
  document.querySelectorAll(".auth-modal").forEach((modal) => {
    modal.style.display = "none";
  });
}

// Plus button functionality - shows login required message
function handlePlusClick() {
  if (!checkAuthStatus()) {
    alert("Please log in or sign up to start a workout!");
    showLoginModal(); // Optional: automatically open login modal
  } else {
    console.log("Starting workout creation...");
    alert("Workout creation feature coming soon!");
  }
}

// Attach event listeners to auth buttons
function attachAuthButtonListeners() {
  const loginBtn = document.querySelector(".login-btn");
  const signupBtn = document.querySelector(".signup-btn");

  if (loginBtn) {
    loginBtn.addEventListener("click", showLoginModal);
  }
  if (signupBtn) {
    signupBtn.addEventListener("click", showSignupModal);
  }
}

// Initialize when DOM is loaded
function initApp() {
  // Check auth status
  checkAuthStatus();

  // Plus button - only for workout creation
  const plusButton = document.querySelector(".plus-icon");
  if (plusButton) {
    plusButton.addEventListener("click", handlePlusClick);
  }

  // Auth buttons - for login/signup
  attachAuthButtonListeners();

  // Form submissions
  const loginForm = document.getElementById("loginForm");
  const signupForm = document.getElementById("signupForm");

  if (loginForm) {
    loginForm.addEventListener("submit", function (e) {
      e.preventDefault();
      const email = this.querySelector('input[type="email"]').value;
      const password = this.querySelector('input[type="password"]').value;
      login(email, password);
    });
  }

  if (signupForm) {
    signupForm.addEventListener("submit", function (e) {
      e.preventDefault();
      const inputs = this.querySelectorAll("input");
      const name = inputs[0].value;
      const email = inputs[1].value;
      const password = inputs[2].value;
      const confirmPassword = inputs[3].value;
      signup(name, email, password, confirmPassword);
    });
  }

  // Close modals
  document.querySelectorAll(".close-modal").forEach((btn) => {
    btn.addEventListener("click", closeAllModals);
  });

  // Close modal when clicking outside
  document.querySelectorAll(".auth-modal").forEach((modal) => {
    modal.addEventListener("click", function (e) {
      if (e.target === modal) {
        closeAllModals();
      }
    });
  });
}

// Fetch and render exercises
async function fetchAndRenderExercises() {
  const res = await fetch("http://localhost:5000/api/exercises");
  const exercises = await res.json();
  const list = document.getElementById("exercise-list");
  list.innerHTML = "";
  exercises.forEach((ex) => {
    const li = document.createElement("li");
    li.textContent = `${ex.name} (${ex.classification}) - PR: ${ex.oneRepPR} lbs`;
    list.appendChild(li);
  });
}

// Calendar functionality
function renderCalendar(year, month) {
  const container = document.getElementById("calendar-container");
  if (!container) return;

  const date = new Date(year, month, 1);
  const days = [];
  const firstDay = date.getDay();
  const lastDate = new Date(year, month + 1, 0).getDate();

  // Header
  let html = `<div class="calendar">
    <div class="calendar-header">
      <button id="prev-month">&lt;</button>
      <span>${date.toLocaleString("default", { month: "long" })} ${year}</span>
      <button id="next-month">&gt;</button>
    </div>
    <div class="calendar-grid">
      <div>Sun</div><div>Mon</div><div>Tue</div><div>Wed</div><div>Thu</div><div>Fri</div><div>Sat</div>
  `;

  // Empty cells before first day
  for (let i = 0; i < firstDay; i++) html += "<div></div>";

  // Days of month
  for (let d = 1; d <= lastDate; d++) {
    html += `<div class="calendar-day" data-day="${d}">${d}</div>`;
  }
  html += "</div></div>";

  container.innerHTML = html;

  // Month navigation
  document.getElementById("prev-month").onclick = () => {
    renderCalendar(month === 0 ? year - 1 : year, month === 0 ? 11 : month - 1);
  };
  document.getElementById("next-month").onclick = () => {
    renderCalendar(
      month === 11 ? year + 1 : year,
      month === 11 ? 0 : month + 1
    );
  };

  // Day click
  container.querySelectorAll(".calendar-day").forEach((day) => {
    day.onclick = () => {
      alert(
        `You selected: ${year}-${String(month + 1).padStart(2, "0")}-${String(
          day.dataset.day
        ).padStart(2, "0")}`
      );
    };
  });
}

// Only run on calendar.html
if (window.location.pathname.endsWith("calendar.html")) {
  document.addEventListener("DOMContentLoaded", () => {
    const today = new Date();
    renderCalendar(today.getFullYear(), today.getMonth());
  });
}

// Start the app when DOM is loaded
document.addEventListener("DOMContentLoaded", initApp);

// Call this after DOMContentLoaded, but only on the workouts page:
if (window.location.pathname.endsWith("workouts.html")) {
  fetchAndRenderExercises();
}
