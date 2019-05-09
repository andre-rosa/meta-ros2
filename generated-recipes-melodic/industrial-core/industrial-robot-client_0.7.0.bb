# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "industrial robot client contains generic clients for connecting       to industrial robot controllers with servers that adhere to the      simple message protocol."
AUTHOR = "Shaun Edwards <sedwards@swri.org>"
ROS_AUTHOR = "Jeremy Zoss"
HOMEPAGE = "http://ros.org/wiki/industrial_robot_client"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "industrial_core"
ROS_BPN = "industrial_robot_client"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    control-msgs \
    industrial-msgs \
    industrial-utils \
    roscpp \
    roslaunch \
    sensor-msgs \
    simple-message \
    std-msgs \
    trajectory-msgs \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    control-msgs \
    industrial-msgs \
    industrial-utils \
    robot-state-publisher \
    roscpp \
    sensor-msgs \
    simple-message \
    std-msgs \
    trajectory-msgs \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    control-msgs \
    industrial-msgs \
    industrial-utils \
    robot-state-publisher \
    roscpp \
    sensor-msgs \
    simple-message \
    std-msgs \
    trajectory-msgs \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-industrial-release/industrial_core-release/archive/release/melodic/industrial_robot_client/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "69f4473ec204e2c7a648425ff78e5027"
SRC_URI[sha256sum] = "c1039af144fc2cbd4de93b448d60d1a5bb417d8ad72f428324ed5a489e882424"
S = "${WORKDIR}/industrial_core-release-release-melodic-industrial_robot_client-0.7.0-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('industrial-core', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('industrial-core', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/industrial-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/industrial-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/industrial-core/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
