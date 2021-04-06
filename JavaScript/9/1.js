let courses = [
    {
        "name": "Orientation to software engineering",
        "code": "SWD1TF001",
        "extent": 5,
        "timing": "1.semester"
    },
    {
        "name": "Programming",
        "code": "SWD1TF002",
        "extent": 5,
        "timing": "2.js.semester"
    },
    {
        "name": "Data management and databases",
        "code": "SWD1TF003",
        "extent": 5,
        "timing": "2.js.semester"
    },
    {
        "name": "Mobile development project",
        "code": "SWD1TF004",
        "extent": 10,
        "timing": "3.semester"
    }

];

function listCourses() {
    let print = '';
    for (let i = 0; i < courses.length; i++) {
        print += "<br><br>Code: "
        print += courses[i].code
        print += "<br>Name: "
        print += courses[i].name
        print += "<br>Extent: "
        print += courses[i].extent
        print += "<br>Timing: "
        print += courses[i].timing
    }
    document.getElementById("answer").innerHTML = print
}
