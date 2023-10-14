let planet;

const handleSubmit = async (e) => {
    e.preventDefault();
    const data = document.getElementById('data');
    const planetspacedata = await fetch(`https://api.le-systeme-solaire.net/rest/bodies/${planet}`);
    const planetdata = await planetspacedata.json();
    data.innerHTML = `
        <h2>${planetdata.englishName}</h2>
        <div class="flex-row">
            <p>Gravity: ${planetdata.gravity}</p>
            <p>Mass: ${planetdata.mass.massValue} ${planetdata.mass.massExponent}</p>
        </div>
        <div class="flex-row">
            <p>Mean Radius: ${planetdata.meanRadius} km</p>
            <p>Escape Velocity: ${planetdata.escape}</p>
        </div>
        <div class="flex-row">
            <p>Rotation Period: ${planetdata.sideralRotation}</p>
            <p>Rotation Velocity: ${planetdata.sideralRotation}</p>
        </div>
        <p>Gravity: ${planetdata.gravity}</p>
    `;

}

const handleSelect = (e) => {
    planet = e.target.value;
}

