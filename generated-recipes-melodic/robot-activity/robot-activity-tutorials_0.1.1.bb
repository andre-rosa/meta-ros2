# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The robot_activity_tutorials package"
AUTHOR = "Maciej ZURAD <maciej.zurad@gmail.com>"
ROS_AUTHOR = "Maciej ZURAD <maciej.zurad@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/robot_activity_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "robot_activity"
ROS_BPN = "robot_activity_tutorials"

ROS_BUILD_DEPENDS = " \
    robot-activity \
    roscpp \
    roslint \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    robot-activity \
    roscpp \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    robot-activity \
    roscpp \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/snt-robotics/robot_activity-release/archive/release/melodic/robot_activity_tutorials/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b2ced329663eff0191356893a131bc1b"
SRC_URI[sha256sum] = "8d4cb4eb59c9bbcb053aef3cd75652525a4f7276d424cc3600a4d0e443807fd2"
S = "${WORKDIR}/robot_activity-release-release-melodic-robot_activity_tutorials-0.1.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('robot-activity', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('robot-activity', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robot-activity/robot-activity_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robot-activity/robot-activity-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robot-activity/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/robot-activity/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
