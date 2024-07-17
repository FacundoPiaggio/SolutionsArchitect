document.querySelectorAll('a[data-house-id]').forEach(link => {
    link.addEventListener('click', function() {
        const houseId = this.getAttribute('data-house-id');
        amplitude.track('House Details Viewed', {
            houseId: houseId
        });
    });
});