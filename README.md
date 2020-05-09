# The Page Object Model framework is manuvered by mouse operation- i.e- Clicks, mouse_over, etc. event.
# I tried to see whether I can manuever through keyboard operation.
# Webdriver Active Element ("webdriver.switchTo().activeElement()") is great to use keystroks.
# I experimented with "Login Feature"
# Step 1-launch Chrome browser- nevigate to target url (multicart in this case)
# Step 2- use activeElement() + TAB to find Login tag.
# Step 3- activate Login by pressing Enter key- insert username and password
# Step 4- activate Login button by pressing Enter Key for succesful login.
# Step 5- move to profile name by pressing Tab - verify profile name.
# I have made changes in MasterPage and HomePage
# The techniques is to loop arround activeElement(), find your desired element, and insert values.
