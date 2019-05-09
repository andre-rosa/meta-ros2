# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "The power_monitor collects messages from the ocean_battery_server and      the pr2_power_board, and publishes a summary of their data in a      friendlier message format."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Tim Field"
HOMEPAGE = "http://www.ros.org/wiki/power_monitor"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_power_drivers"
ROS_BPN = "power_monitor"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    pr2-msgs \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    pr2-msgs \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    pr2-msgs \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_power_drivers-release/archive/release/melodic/power_monitor/1.1.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0a38074a551cdb6ccef2cc9d7be0125b"
SRC_URI[sha256sum] = "f77e8657675508e110c8e9d34d404a6f786b46fb91ccbec84ca6b8e2cd7ff444"
S = "${WORKDIR}/pr2_power_drivers-release-release-melodic-power_monitor-1.1.7-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('pr2-power-drivers', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('pr2-power-drivers', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-power-drivers/pr2-power-drivers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-power-drivers/pr2-power-drivers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-power-drivers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/pr2-power-drivers/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
