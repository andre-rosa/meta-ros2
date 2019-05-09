# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "OpenManipulator 3D model description for visualization and simulation"
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/open_manipulator_description"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "open_manipulator"
ROS_BPN = "open_manipulator_description"

ROS_BUILD_DEPENDS = " \
    joint-state-publisher \
    robot-state-publisher \
    urdf \
    xacro \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    joint-state-publisher \
    robot-state-publisher \
    urdf \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-state-publisher \
    robot-state-publisher \
    urdf \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator-release/archive/release/melodic/open_manipulator_description/2.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ee6653cf91a489770777a0ca72cb6447"
SRC_URI[sha256sum] = "f44f4bb8965b79fffdf4906f742e4fccd178a55c8ee11e3abacc24828e5ae9c5"
S = "${WORKDIR}/open_manipulator-release-release-melodic-open_manipulator_description-2.0.1-0"

ROS_BUILD_TYPE = "catkin"
ROS_COMPONENT_TYPE = "${@ros_common__get_component_type('open-manipulator', d)}"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('open-manipulator', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator/open-manipulator_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator/open-manipulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/open-manipulator/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
