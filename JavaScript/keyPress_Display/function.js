const key = document.getElementById('insert');

const get = window.addEventListener('keydown', (e) => {
    key.innerHTML = `
  <span>
  <table>
  <tr>
    <th>Key</th>
    <th>Name</th>
  </tr>
  <tr>
    <td>${e.key === ' ' ? 'Space' : e.key}</td>
    <td>${e.code}</td>
   

</table>
  </span>
  `;
});
