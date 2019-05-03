# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "position_controllers"
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
HOMEPAGE = "https://github.com/ros-controls/ros_controllers/wiki"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BPN = "position_controllers"

ROS_BUILD_DEPENDS = " \
    controller-interface \
    forward-command-controller \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-interface \
    forward-command-controller \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-interface \
    forward-command-controller \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/position_controllers/0.15.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6d61885736973f9010dd45c687c6f6e6"
SRC_URI[sha256sum] = "4fc2790e75f82b2a202e46c7c851f61348aaf1f355f69cb940ead157d5e43368"
S = "${WORKDIR}/ros_controllers-release-release-melodic-position_controllers-0.15.0-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('ros-controllers', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-controllers/ros-controllers_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-controllers/ros-controllers-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-controllers/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ros-controllers/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
