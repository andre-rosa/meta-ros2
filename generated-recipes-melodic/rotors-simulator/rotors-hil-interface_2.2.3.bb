# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

inherit ros_superflore_generated

DESCRIPTION = "RotorS Hardware-in-the-loop interface package"
AUTHOR = "Pavel Vechersky <pvechersky@gmail.com>"
HOMEPAGE = "https://github.com/ethz-asl/rotors_simulator"
SECTION = "devel"
LICENSE = "ASL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

ROS_BPN = "rotors_hil_interface"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    mav-msgs \
    mavros \
    mavros-msgs \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    mav-msgs \
    mavros \
    mavros-msgs \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    mav-msgs \
    mavros \
    mavros-msgs \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_hil_interface/2.2.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8399120c1cdcc6c67667542bce0970d5"
SRC_URI[sha256sum] = "ee4f035b44afcf982354c3740f05087f5dc9c8f2fffee6816a5e9dc435d46fc5"
S = "${WORKDIR}/rotors_simulator-release-release-melodic-rotors_hil_interface-2.2.3-0"

ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_RECIPES_TREE := "${@ros_superflore_generated__get_recipes_tree('rotors-simulator', d)}"
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rotors-simulator/rotors-simulator_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rotors-simulator/rotors-simulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rotors-simulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rotors-simulator/${BPN}-${PV}.inc

inherit ros_distro_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
