<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Experience Certificate</title>
    <style>
        body {
            position: relative;
        }
        .watermark {
                   position: fixed;
                   top: 25%;
                   left: 20%;
                   transform: translate(-50%, -50%) rotate(30deg);
                   z-index: -1;
                   width: 400px;
                   height: auto;
                   text-align: center;
               }

               .watermark img {
                   width: 100%;
                   height: auto;
                   opacity: 0.05;
               }
        .header {
            text-align: center;
            margin-top: 20px;
        }
        .logo {
            text-align: right;
            background-size: contain;
        }
        .date {
            text-align: left;
            padding: 20px;
        }
        .title {
            margin-top: 30px;
            text-align: center;
        }
    </style>
</head>
<body>
    <div>

      <div class="logo">
               <#if company[0].imageFile?has_content>
               <img style="height: 90px; width: 200px;" src="${company[0].imageFile}" alt="Company Logo" />
               </#if>
           </div>
      </div>
          <div class="header"><b>EXPERIENCE CERTIFICATE</b></div>
          <div class="date">Date: <b>${request.date}</b></div>
      <div class="title"><b>TO WHOMSOEVER IT MAY CONCERN</b></div>
      <div class="content">
           <div class="watermark">
               <img src="${blurredImage}" alt="Blurred Company Logo" />
           </div>
        <p>This is to certify that <b>${employee.firstName} ${employee.lastName}</b> was employed with our company ${company[0].companyName} from ${employee.dateOfHiring} to ${request.date}
        <#if employee.designationName?has_content>
            as a <b>${employee.designationName}</b>.
        </#if>
        </p>
        <p>We found ${employee.firstName} ${employee.lastName} to be very dedicated to the work assigned. He was result-oriented, professional, and sincere. He carries excellent interpersonal skills and knowledge which helped in completing many valuable business assignments. He is a true team player and a fun-loving individual who mixed well with both his seniors and juniors.</p>
        <p>We wish him all the best for future ventures. Please feel free to contact us for any other information required.</p>

        <div>For company ${company[0].companyName}</div>

         <div style="margin-top:100px">Authorized Signature</div>
    </div>
</body>
</html>
