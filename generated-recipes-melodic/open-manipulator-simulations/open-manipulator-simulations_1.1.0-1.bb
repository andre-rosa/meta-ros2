# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Simulation packages for OpenManipulator"
AUTHOR = "Pyo <pyo@robotis.com>"
ROS_AUTHOR = "Darby Lim <thlim@robotis.com>"
HOMEPAGE = "http://wiki.ros.org/open_manipulator_simulations"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "open_manipulator_simulations"
ROS_BPN = "open_manipulator_simulations"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    open-manipulator-gazebo \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/open_manipulator_simulations-release/archive/release/melodic/open_manipulator_simulations/1.1.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "abb238160ef4f3955c512d8e278abb6b"
SRC_URI[sha256sum] = "5e55fe725d7a194014a7ba81ec9ba3436209a0076a05799156ccf09bceb657b4"
S = "${WORKDIR}/open_manipulator_simulations-release-release-melodic-open_manipulator_simulations-1.1.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('open-manipulator-simulations', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('open-manipulator-simulations', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/open-manipulator-simulations/open-manipulator-simulations_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/open-manipulator-simulations/open-manipulator-simulations-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/open-manipulator-simulations/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/open-manipulator-simulations/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
