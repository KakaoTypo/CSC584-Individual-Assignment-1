<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Personnel File Output</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <h2>Personnel Summary</h2>
        
        <div style="margin-bottom: 20px;">
            <span class="badge">STATUS: VERIFIED</span>
            <span class="badge" style="border-color:#00f0ff; color:#00f0ff;">CLEARANCE: VERIFIED</span>
        </div>

        <div class="profile-field">
            <label>Name</label>
            <div>${userName}</div>
        </div>

        <div class="profile-field">
            <label>ID</label>
            <div>${userStudentId}</div>
        </div>

        <div class="profile-field">
            <label>Specialization</label>
            <div>${userProgramme}</div>
        </div>

        <div class="profile-field">
            <label>Email</label>
            <div>${userEmail}</div>
        </div>

        <div class="profile-field">
            <label>Hobbies</label>
            <div>${userHobbies}</div>
        </div>

        <div class="profile-field">
            <label>Brief</label>
            <div style="line-height: 1.6;">${userBio}</div>
        </div>

        <a href="index.html" class="btn-back">&#8592; Re-initialize Form</a>
    </div>
</body>
</html>