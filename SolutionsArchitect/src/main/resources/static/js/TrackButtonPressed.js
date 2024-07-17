document.getElementById('myButton').addEventListener('click', function() {
    amplitude.track('Button Clicked', {
        buttonId: 'myButton',
        buttonText: 'Click me'
    });
});