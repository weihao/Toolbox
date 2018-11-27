const fs = require('fs');

var start = new Date().getTime();
let rawdata = fs.readFileSync('logs.json'); // Current working directory.
let records = JSON.parse(rawdata);

let result = [];

for (let record of records) {
    // You logic here.
    if (record.jsonPayload && record.jsonPayload.log_type && record.jsonPayload.log_type === "event_signup") {
        result.push({
            "user": record.jsonPayload.user,
            "time": record.receiveTimestamp
        });
    }
}

// Writes the output.
fs.writeFile("output.json", JSON.stringify(result), function (err) {
    if (err) throw err;
    var end = new Date().getTime();
    console.log("Completed in " + (end - start) + " milliseconds.");
});