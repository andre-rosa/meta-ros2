# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The pr2_teleop package"
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "TODO"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

ROS_CN = "pr2_apps"
ROS_BPN = "pr2_teleop"

ROS_BUILD_DEPENDS = " \
    actionlib \
    geometry-msgs \
    pr2-controllers-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf \
    topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    geometry-msgs \
    pr2-controllers-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    geometry-msgs \
    pr2-controllers-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_apps-release/archive/release/melodic/pr2_teleop/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dc2829b248d9901d559832073564c080"
SRC_URI[sha256sum] = "58621f94cdf383410e0b4e896be17b09320461196422f8e14e28e19a58680625"
S = "${WORKDIR}/pr2_apps-release-release-melodic-pr2_teleop-0.6.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('pr2-apps', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('pr2-apps', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-apps/pr2-apps_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-apps/pr2-apps-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-apps/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-apps/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
