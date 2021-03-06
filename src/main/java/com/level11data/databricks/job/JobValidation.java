package com.level11data.databricks.job;

import com.level11data.databricks.client.entities.jobs.JobDTO;
import com.level11data.databricks.client.entities.jobs.JobSettingsDTO;

public class JobValidation {


    public static void validateInteractiveNotebookJob(JobDTO jobDTO) throws JobConfigException {
        //Validate if JobDTO is for an Interactive AbstractNotebook Job or not
        if(!jobDTO.isInteractive()) {
            throw new JobConfigException("Job is NOT configured as an Interactive Job");
        } else if(!jobDTO.isNotebookJob()) {
            throw new JobConfigException("Job is NOT configured as a AbstractNotebook Job");
        }
    }

    public static void validateInteractiveNotebookJob(JobSettingsDTO jobSettingsDTO) throws JobConfigException {
        //Validate if JobDTO is for an Interactive AbstractNotebook Job or not
        if(!jobSettingsDTO.isInteractive()) {
            throw new JobConfigException("Job is NOT configured as an Interactive Job");
        } else if(!jobSettingsDTO.isNotebookJob()) {
            throw new JobConfigException("Job is NOT configured as a AbstractNotebook Job");
        }
    }

    public static void validateInteractiveJarJob(JobDTO jobDTO) throws JobConfigException {
        //Validate if JobDTO is for an Interactive JAR Job or not
        if(!jobDTO.isInteractive()) {
            throw new JobConfigException("Job is NOT configured as an Interactive Job");
        } else if(!jobDTO.isJarJob()) {
            throw new JobConfigException("Job is NOT configured as a Jar Job");
        }
    }

    public static void validateInteractiveJarJob(JobSettingsDTO jobSettingsDTO) throws JobConfigException {
        //Validate if JobDTO is for an Interactive JAR Job or not
        if(!jobSettingsDTO.isInteractive()) {
            throw new JobConfigException("Job is NOT configured as an Interactive Job");
        } else if(!jobSettingsDTO.isJarJob()) {
            throw new JobConfigException("Job is NOT configured as a Jar Job");
        }
    }

    public static void validateInteractivePythonJob(JobSettingsDTO jobSettingsDTO) throws JobConfigException {
        //Validate if JobDTO is for an Interactive JAR Job or not
        if(!jobSettingsDTO.isInteractive()) {
            throw new JobConfigException("Job is NOT configured as an Interactive Job");
        } else if(!jobSettingsDTO.isPythonJob()) {
            throw new JobConfigException("Job is NOT configured as a Python Job");
        }
    }

    public static void validateInteractivePythonJob(JobDTO jobDTO) throws JobConfigException {
        //Validate if JobDTO is for an Interactive JAR Job or not
        if(!jobDTO.isInteractive()) {
            throw new JobConfigException("Job is NOT configured as an Interactive Job");
        } else if(!jobDTO.isPythonJob()) {
            throw new JobConfigException("Job is NOT configured as a Python Job");
        }
    }

    public static void validateAutomatedNotebookJob(JobDTO jobDTO) throws JobConfigException {
        //Validate if JobDTO is for an Automated AbstractNotebook Job or not
        if(!jobDTO.isAutomated()) {
            throw new JobConfigException("Job is NOT configured as an Automated Job");
        } else if(!jobDTO.isNotebookJob()) {
            throw new JobConfigException("Job is NOT configured as a AbstractNotebook Job");
        }
    }

    public static void validateAutomatedNotebookJob(JobSettingsDTO jobSettingsDTO) throws JobConfigException {
        //Validate if JobDTO is for an Automated AbstractNotebook Job or not
        if(!jobSettingsDTO.isAutomated()) {
            throw new JobConfigException("Job is NOT configured as an Automated Job");
        } else if(!jobSettingsDTO.isNotebookJob()) {
            throw new JobConfigException("Job is NOT configured as a AbstractNotebook Job");
        }
    }

    public static void validateAutomatedJarJob(JobDTO jobDTO) throws JobConfigException {
        //Validate if JobDTO is for an Automated JAR Job or not
        if(!jobDTO.isAutomated()) {
            throw new JobConfigException("Job is NOT configured as an Automated Job");
        } else if(!jobDTO.isJarJob()) {
            throw new JobConfigException("Job is NOT configured as a Jar Job");
        }
    }

    public static void validateAutomatedSparkSubmitJob(JobDTO jobDTO) throws JobConfigException {
        //Validate if JobDTO is for an Automated Spark Submit Job or not
        if(!jobDTO.isAutomated()) {
            throw new JobConfigException("Job is NOT configured as an Automated Job");
        } else if(!jobDTO.isSparkSubmitJob()) {
            throw new JobConfigException("Job is NOT configured as a Spark Submit Job");
        }
    }

    public static void validateAutomatedJarJob(JobSettingsDTO jobSettingsDTO) throws JobConfigException {
        //Validate if JobDTO is for an Automated JAR Job or not
        if(!jobSettingsDTO.isAutomated()) {
            throw new JobConfigException("Job is NOT configured as an Automated Job");
        } else if(!jobSettingsDTO.isJarJob()) {
            throw new JobConfigException("Job is NOT configured as a Jar Job");
        }
    }

    public static void validateAutomatedSparkSubmitJob(JobSettingsDTO jobSettingsDTO) throws JobConfigException {
        //Validate if JobDTO is for an Automated Spark Submit Job or not
        if(!jobSettingsDTO.isAutomated()) {
            throw new JobConfigException("Job is NOT configured as an Automated Job");
        } else if(!jobSettingsDTO.isSparkSubmitJob()) {
            throw new JobConfigException("Job is NOT configured as a Spark Submit Job");
        }
    }

    public static void validateAutomatedPythonJob(JobSettingsDTO jobSettingsDTO) throws JobConfigException {
        //Validate if JobDTO is for an Automated Python Job or not
        if(!jobSettingsDTO.isAutomated()) {
            throw new JobConfigException("Job is NOT configured as an Automated Job");
        } else if(!jobSettingsDTO.isPythonJob()) {
            throw new JobConfigException("Job is NOT configured as a Python Job");
        }
    }

    public static void validateAutomatedPythonJob(JobDTO jobDTO) throws JobConfigException {
        //Validate if JobDTO is for an Automated Python Job or not
        if(!jobDTO.isAutomated()) {
            throw new JobConfigException("Job is NOT configured as an Automated Job");
        } else if(!jobDTO.isPythonJob()) {
            throw new JobConfigException("Job is NOT configured as a Python Job");
        }
    }

}
