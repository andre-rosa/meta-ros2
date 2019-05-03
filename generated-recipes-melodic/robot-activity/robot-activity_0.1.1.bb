# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The robot_activity package implements ROS node lifecycle"
AUTHOR = "Maciej ZURAD <maciej.zurad@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/robot_activity"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "robot_activity"

ROS_BUILD_DEPENDS = " \
    robot-activity-msgs \
    roscpp \
    roslint \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    robot-activity-msgs \
    roscpp \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    robot-activity-msgs \
    roscpp \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/snt-robotics/robot_activity-release/archive/release/melodic/robot_activity/0.1.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a9de29e1967ab2345dac59c2c80cdf7b"
SRC_URI[sha256sum] = "9aea7f4b03a74445c52faddfcd58ea086b7ad8af058a6a3749e9b992849a5361"
S = "${WORKDIR}/robot_activity-release-release-melodic-robot_activity-0.1.1-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('robot-activity', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-activity/robot-activity_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-activity/robot-activity-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-activity/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/robot-activity/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
