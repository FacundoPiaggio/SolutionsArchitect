document.getElementById('feedbackForm').addEventListener('submit', function (e) {
    e.preventDefault();

    amplitude.track('Feedback Submitted', {
        name: document.getElementById('name').value,
        email: document.getElementById('email').value,
        feedback: document.getElementById('feedback').value
    });

    fetch('/feedback', {
        method: 'POST',
        body: new FormData(this)
    })
        .then(response => response.json())
        .then(data => {
            alert('Feedback submitted successfully!');
            console.log(data);
            window.location.href = "/home";
        })
        .catch(error => {
            console.error('Error:', error);
            alert('There was an error submitting your feedback.');
        });
});

document.getElementById('name').addEventListener('focus', function() {
    amplitude.track('Form Started', {
        formId: 'feedbackForm',
        fieldId: 'name',
        pageUrl: window.location.href
    });
});