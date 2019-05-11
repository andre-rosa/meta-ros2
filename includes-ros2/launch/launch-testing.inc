# Copyright (c) 2019 LG Electronics, Inc.

#ALLOW_EMPTY_${PN} = "1"

# This component puts *_proc files under libdir.
FILES_${PN}-dev_prepend = " \
    ${libdir}/${ROS_BPN} \
"
