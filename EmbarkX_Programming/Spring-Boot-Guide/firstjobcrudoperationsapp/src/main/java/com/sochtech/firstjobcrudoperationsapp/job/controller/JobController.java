package com.sochtech.firstjobcrudoperationsapp.job.controller;

import com.sochtech.firstjobcrudoperationsapp.job.entity.Job;
import com.sochtech.firstjobcrudoperationsapp.job.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/jobs")
public class JobController {
    // private final List<Job> jobs = new ArrayList<>();
    private final JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

//    @GetMapping
//    public List<Job> findAll() {
        // return jobs;
//        return jobService.findAll();
//    }

    @GetMapping
    public ResponseEntity<List<Job>> findAll() {
        return ResponseEntity.ok(jobService.findAll());
    }

//    @PostMapping
//    public String createJob(@RequestBody Job job) {
//        // jobs.add(job);
//        jobService.createJob(job);
//        return "Job added successfully";
//    }
    @PostMapping
    public ResponseEntity<String> createJob(@RequestBody Job job) {
        // jobs.add(job);
        jobService.createJob(job);
        return new ResponseEntity<>("Job added successfully", HttpStatus.CREATED);
    }

//    @GetMapping("/{id}")
//    public Job getJobById(@PathVariable Long id) {
//        Job job = jobService.getJobById(id);
//        if (job != null) return job;
//        return job;
//    }
    @GetMapping("/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable Long id) {
        Job job = jobService.getJobById(id);
        if (job != null)
            return new ResponseEntity<>(job, HttpStatus.OK);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteJob(Long id) {
        boolean deleted = jobService.deleteJobById(id);
        if (deleted)
            return new ResponseEntity<>("Job deleted successfully", HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/{id}")
    // @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public ResponseEntity<String> updateJob(@PathVariable Long id, @RequestBody Job updatedJob) {
        boolean updated = jobService.updateJob(id, updatedJob);
        if (updated)
            return new ResponseEntity<>("Job updated successfully", HttpStatus.OK);

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

/*
*  GET /jobs: Get all jobs
*  GET /jobs/{id}: Get a specific job by ID
*  POST /jobs: Create a new job (request body should contain the job details)
*  DELETE /jobs/{id}: Delete a specific job by ID
*  PUT /jobs/{id}: Update a specific job by ID (request body should contain the updated job)
*  GET /jobs/{id}/company: Get the company associated with a specific job by ID
*
*  Example API URLs:
*  GET {base_url}/jobs
*  GET {base_url}/jobs/1
*  POST {base_url}/jobs
*  DELETE {base_url}/jobs/1
*  PUT {base_url}/jobs/1
*  GET {base_url}/jobs/1/company
*
* */

















