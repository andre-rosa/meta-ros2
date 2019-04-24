# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Messages used by nodes in the people stack."
AUTHOR = "Dan Lazewatsky <dan@lazewatsky.com>"
ROS_AUTHOR = "Caroline Pantofaru"
HOMEPAGE = "http://ros.org/wiki/people_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "people"
ROS_BPN = "people_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/melodic/people_msgs/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "50374d01b2fcb427e7d9fc9ca1138ffd"
SRC_URI[sha256sum] = "37885342c0d98ce64a2bfd0f0145edc510220564fdea1284c496e28b848f36d7"
S = "${WORKDIR}/people-release-release-melodic-people_msgs-1.1.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('people', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('people', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/people/people_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/people/people-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/people/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/people/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
