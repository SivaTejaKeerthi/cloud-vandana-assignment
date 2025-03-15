const images = [
    'Images/image-1.jpg',
    'Images/image-2.jpg',
    'Images/image-3.jpg',
    'Images/image-4.jpg',
    'Images/image-5.jpg'
];

let currentIndex = 0;

function showImage(index) {
    document.getElementById('slider-image').src = images[index];
}

function nextImage() {
    currentIndex = (currentIndex + 1) % images.length;
    showImage(currentIndex);
}

function prevImage() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    showImage(currentIndex);
}

// Initialize the slider with the first image
showImage(currentIndex);
