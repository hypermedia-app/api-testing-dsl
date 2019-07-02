# api-testing-dsl

Hypermedia-style API testing DSL


## Setting up the api-testing-dsl projects for development

* Install a Java JDK (Java 8)

* Install Eclipse including the Xtext SDK: https://www.eclipse.org/downloads/packages/release/2019-03/r/eclipse-ide-java-and-dsl-developers

* (In Eclipse) Add git repo:
  * Show the "Git Repositories" view: *Window | Show View | Other... | Git | Git Repositories*
  * Add git repo: *Add an (existing) Repository* in the "Git Repositories" view
    * Select `~/git/api-testing-dsl`, *Add*

* (In Eclipse) Import Projects: *File | Import ... | Git | Projects from Git*, *Next*
  * Select *Existing local repository*, *Next*
  * Select `api-testing-dsl`, *Next*
  * Select *Import existing Eclipse Projects* and verify that the `Working Tree` top-node is selected, *Next*
  * Verify that all projects are selected, *Finish*

The projects should now be imported. There might be build path and the build finish without errors.

## Using git from inside Eclipse

To configure the SSH key for github authentication:

* *Window | Preferences*
  * *General | Network Connections | SSH2*
    * Tab *General*, *Add  Private Key...*, *Apply and Close*


## Running the ApiTestingDsl Editor during DSL development

* *Run | Run Configurations*
  * Select *Eclipse Application | Launch ApiTestingDsl Editor*, *Run*.  This will start a new Eclipse instance with the DSL plugins activated.
* Subsequently, "Launch ApiTestingDsl Editor" can be found in the dropdown next to the green play button.
* (In ApiTestingDsl Editor) Import example project: *File | Import ... | General | Existing Projects into Workspace*
  * Select root directory: `/home/foo/git/api-testing-dsl/api-examples`, *Refresh*
  * Verify that the `api-examples` project is selected, *Finish*

The DSL editor is activated once files with the `.api` extension are opened.
