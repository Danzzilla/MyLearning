'use strict';

///////////////////////////////////////
// Modal window

const modal = document.querySelector('.modal');
const overlay = document.querySelector('.overlay');
const btnCloseModal = document.querySelector('.btn--close-modal');
const btnsOpenModal = document.querySelectorAll('.btn--show-modal');

const openModal = function () {
  modal.classList.remove('hidden');
  overlay.classList.remove('hidden');
};

const closeModal = function () {
  modal.classList.add('hidden');
  overlay.classList.add('hidden');
};

for (let i = 0; i < btnsOpenModal.length; i++)
  btnsOpenModal[i].addEventListener('click', openModal);

btnCloseModal.addEventListener('click', closeModal);
overlay.addEventListener('click', closeModal);

document.addEventListener('keydown', function (e) {
  if (e.key === 'Escape' && !modal.classList.contains('hidden')) {
    closeModal();
  }
});

// const h1 = document.querySelector("h1");

// function alertH1(event){
//   alert("addEventListener: Great! You are reading the heading :D")

//   h1.removeEventListener("mouseenter", alertH1);
// }

// h1.addEventListener("mouseenter", alertH1);

// // h1.onmouseover("mouseenter", function(event){
// //   alert("addEventListener: Great! You are reading the heading :D");
// // });

// //setTimeout(() => removeEventListener("mouseenter", alertH1), 30);

// const randomInt = (min, max) =>
//   Math.floor(Math.random() + max - min + 1 + min);

// const randomColor = () =>
//   `rgb(${randomInt(0,255)}, ${randomInt(0,255)}, ${randomInt(0,255)})`;

// document.querySelector(".nav__link").addEventListener("click", function(event){
//   this.style.backgroundColor = randomColor();
//   console.log("LINK", event.target, event.currentTarget);
//   console.log(event.currentTarget === this);

//   // //stop propagation
//   // event.stopPropagation();
// });

// document.querySelector(".nav__links").addEventListener("click", function(event){
//   this.style.backgroundColor = randomColor();
//   console.log("CONTAINER", event.target, event.currentTarget);
//   console.log(event.currentTarget === this);
// });

// document.querySelector(".nav").addEventListener("click", function(event){
//   this.style.backgroundColor = randomColor();
//   console.log("NAV", event.target, event.currentTarget);
//   console.log(event.currentTarget === this);
// },
//   true
// );

const btnScrollTo = document.querySelector(".btn--scroll-to");
const section1 = document.querySelector("#section--1");

btnScrollTo.addEventListener("click", function(event){
  const s1coords = section1.getBoundingClientRect();
  console.log(s1coords);
  
  console.log(event.target.getBoundingClientRect());

  console.log("Current scroll (X/Y)", window.pageXOffset, window.pageYOffset);

  console.log("Height/width viewport",
  document.documentElement.clientHeight,
  document.documentElement.clientWidth
  );

  section1.scrollIntoView({beahavior: "smooth"});
});

// document.querySelectorAll(".nav__link").forEach(function(el){
//   el.addEventListener("click", function(event){
//     event.preventDefault();
//     const id = this.getAttribute("href");
//     console.log(id);
//     document.querySelector(id).scrollIntoView({behavior: "smooth"});
//   });
// });


//1. Add event listener to common parent element
//2. determing what element originated the event

document.querySelector(".nav__links").addEventListener("click", function(event){
  event.preventDefault();

  //Matching strategy
  if(event.target.classList.contains("nav__link")){
    const id = event.target.getAttribute("href");
    document.querySelector(id).scrollIntoView({behavior: "smooth"});
  }
});

// //traversing DOM
// const h1 = document.querySelector("h1");

// //going downwards: child
// console.log(h1.querySelectorAll(".highlight"));
// console.log(h1.childNodes);
// console.log(h1.children);
// h1.firstElementChild.style.color = "white";
// h1.lastElementChild.style.color = "orangered";

// //going upwards: parents
// console.log(h1.parentNode);
// console.log(h1.parentElement);

// h1.closest(".header").style.background = "var(--gradient-secondary)";
// h1.closest("h1").style.background = "var(--gradient-primary)";

// //going sideways
// console.log(h1.previousElementSibling);
// console.log(h1.nextElementSibling);

// console.log(h1.previousSibling);
// console.log(h1.nextSibling);

// console.log(h1.parentElement.children);
// [...h1.parentElement.children].forEach(function(el){
//   if(el !== h1) el.style.transform = "scale(0.5)";
// });

//Tabbed component
const tabs = document.querySelectorAll(".operations__tab");
const tabsContainer = document.querySelector(".operations__tab-container");
const tabsContent = document.querySelectorAll(".operations__content");

tabsContainer.addEventListener("click", function(event){
  const clicked = event.target.closest(".operations__tab");

  //Guard clause
  if(!clicked) return;

  tabs.forEach(t => t.classList.remove("operations__tab--active"));
  tabsContent.forEach(c => c.classList.remove("operations__content--active"));

  clicked.classList.add("operations__tab--active");

  //Activate content area
  document.querySelector(`.operations__content--${clicked.dataset.tab}`).classList.add("operations__content--active");
});

//Menu fade animation
const nav = document.querySelector(".nav");

function handleHover(event){

  if(event.target.classList.contains("nav__link")){
    const link = event.target;
    const siblings = link.closest(".nav").querySelectorAll(".nav__link");
    const logo = link.closest(".nav").querySelector("img");
    
    siblings.forEach(el => {
      if(el !== link) el.style.opacity = this;
    });
    logo.style.opacity = this;
  }
}

//passing "argument into handler"
nav.addEventListener("mouseover", handleHover.bind(0.5));
nav.addEventListener("mouseout", handleHover.bind(1));

//sticky navigation
const initialCoords = section1.getBoundingClientRect();

window.addEventListener("scroll", function(event){

  if(this.window.scrollY > initialCoords.top) nav.classList.add("sticky");
  else nav.classList.remove("sticky");
})